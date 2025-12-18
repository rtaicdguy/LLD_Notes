package design.patterns.creational.singleton;

public class Logger {
    private static volatile Logger logger;

    private Logger(){
        if(logger!=null){
            throw new RuntimeException("Use getInstance()");
        }
    }

    public static Logger getInstance(){
        if(logger==null){
            synchronized (Logger.class){
                if(logger==null){
                    logger=new Logger();
                }
            }
        }
        return logger;
    }
    public void logFiles(){
        System.out.println("Logging the files");
    }
}
