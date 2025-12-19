package design.patterns.behavioral.chainOfResponsibility.denominations;

public class Denomination {
    private final Integer value;
    private Integer numberOfNotes;
    private Denomination nextDenomination;

    public Denomination(Integer value,Integer numberOfNotes){
        this.value=value;
        this.numberOfNotes=numberOfNotes;
        nextDenomination=null;
    }

    void addNotes(Integer input){
        numberOfNotes+=input;
    }
    public void setNextDenomination(Denomination nextDenomination){
        this.nextDenomination=nextDenomination;
    }
    public void process(Integer input){
        int requiredNotes=input/value;

        final int actualNotes= requiredNotes<=numberOfNotes ? requiredNotes : numberOfNotes;
        if(actualNotes>0){
            System.out.println("Dispensing: "+value+ " -> "+actualNotes+" times");
        }
        final int remainingAmount=input-actualNotes*value;
        if(nextDenomination==null){
            System.out.println("Pending Money: "+remainingAmount);
        } else {
            nextDenomination.process(remainingAmount);
        }
    }
}
