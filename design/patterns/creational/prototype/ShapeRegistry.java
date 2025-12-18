package design.patterns.creational.prototype;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Prototype Registry (Cache)
 * 
 * This class demonstrates the Registry pattern combined with Prototype.
 * It caches expensive-to-create objects and returns clones when requested.
 * 
 * Key Benefits:
 * 1. Database call happens ONLY ONCE per unique shape ID
 * 2. All subsequent requests return clones (fast)
 * 3. Each clone is independent (modifications don't affect others)
 * 4. Significant performance improvement for repeated requests
 */
public class ShapeRegistry {
    
    // Cache to store prototype shapes
    private static Map<String, Shape> cache = new HashMap<>();
    
    /**
     * Get a shape by ID.
     * 
     * If the shape is not in cache:
     *   - Fetch from database (expensive operation)
     *   - Store in cache for future use
     * 
     * Always return a CLONE to ensure independence.
     * 
     * @param shapeId the ID of the shape to retrieve
     * @return a cloned Shape object
     */
    public static Shape getShape(String shapeId) {
        
        if (!cache.containsKey(shapeId)) {
            // DB call happens ONLY once per unique ID
            System.out.println("⚠️  Shape not in cache. Fetching from database...");
            Shape shapeFromDB = Database.fetchShapeFromDB(shapeId);
            cache.put(shapeId, shapeFromDB);
            System.out.println("✅ Shape cached for future use.\n");
        } else {
            System.out.println("✅ Shape found in cache. Returning clone (no DB call).\n");
        }
        
        // Always return a clone to ensure independence
        return (Shape) cache.get(shapeId).clone();
    }
    
    /**
     * Clear the cache (useful for testing or memory management)
     */
    public static void clearCache() {
        cache.clear();
        System.out.println("🗑️  Cache cleared.");
    }
    
    /**
     * Get cache statistics
     */
    public static void printCacheStats() {
        System.out.println("📊 Cache Statistics:");
        System.out.println("   - Cached shapes: " + cache.size());
        System.out.println("   - Shape IDs: " + cache.keySet());
    }
}
