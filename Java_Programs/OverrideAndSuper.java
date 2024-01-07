class EventResistration{
    String name,nameOfEvent;
    double resistFee;
    EventResistration(String name,String nameOfEvent){
        this.name=name;
        this.nameOfEvent=nameOfEvent;
    }
    void resisterEvent(){
        System.out.println("Your Resistration fees: "+ resistFee);
    }
}

class SingleEventResister extends EventResistration{
    int ParticipantNo;

    SingleEventResister(String name,String nameOfEvent,int ParticipantNo){
        super(name, nameOfEvent);
        this.ParticipantNo=ParticipantNo;
    }
    
    void resisterEvent(){
        if(nameOfEvent.equals("ShakeALeg")){
            resistFee=100;
        }
        if(nameOfEvent.equals("Sing&Win")){
            resistFee=150;
        }
        if(nameOfEvent.equals("PlayAway")){
            resistFee=130;
        }
        super.resisterEvent();
    }
}

class TeamEventResistration extends EventResistration{
    int noOfParticipant,teamNo;

    TeamEventResistration(String name,String nameOfEvent,int noOfParticipant,int teamNo){
        super(name, nameOfEvent);
        this.noOfParticipant=noOfParticipant;
        this.teamNo=teamNo;
    }
    
    void resisterEvent(){
        if(nameOfEvent.equals("ShakeALeg")){
            resistFee=50*noOfParticipant;
        }
        if(nameOfEvent.equals("Sing&Win")){
            resistFee=60*noOfParticipant;
        }
        if(nameOfEvent.equals("PlayAway")){
            resistFee=100*noOfParticipant;
        }
        if(nameOfEvent.equals("Actathon")){
            resistFee=80*noOfParticipant;
        }
        super.resisterEvent();

}
}

public class OverrideAndSuper {
    public static void main(String[] args) {
        SingleEventResister s1=new SingleEventResister("jenny", "Sing&Win", 1);
        s1.resisterEvent();
        System.out.println("You are participant no: "+ s1.ParticipantNo);
        TeamEventResistration t1=new TeamEventResistration("Aura", "ShakeALeg", 5, 1);
        t1.resisterEvent();
        System.out.println("You are participant no: "+ s1.ParticipantNo);

    }
}

/* output

PS C:\Users\bhoir\OneDrive\Desktop\Info_> javac OverrideAndSuper.java   
PS C:\Users\bhoir\OneDrive\Desktop\Info_> java OverrideAndSuper

Your Resistration fees: 150.0
You are participant no: 1
Your Resistration fees: 250.0
You are participant no: 1

*/