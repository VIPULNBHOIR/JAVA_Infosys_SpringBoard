public class PlayerRating {
    int Player_position;
    String PlayerName;
    float criticOneRating,criticTwoRating,criticThreeRating,AverageRating;
    char category;

    PlayerRating(int Player_position,String PlayerName){
        this.PlayerName=PlayerName;
        this.Player_position=Player_position;
    }
    void calculateAverageRating(float criticOneRating,float criticTwoRating){
        this.AverageRating=(criticTwoRating+criticOneRating)/2;
    }
    void calculateAverageRating(float criticOneRating,float criticTwoRating,float criticThreeRating){
        this.AverageRating=(criticTwoRating + criticOneRating + criticThreeRating)/2;
    }
    void calculateCategory(){
        if (AverageRating<=5){
            this.category='C';
        }
        else if (AverageRating<=8){
            this.category='B';
        }
        else{
            this.category='A';
        }
    }
    void display(){
        System.out.println("The Player name is "+ PlayerName);
        System.out.println("The Player position is "+ Player_position);
        System.out.println("The Average Rating is "+AverageRating);
        System.out.println("The category is "+category);
    }
    public static void main(String[] args) {
        PlayerRating player1=new PlayerRating(1,"beckham");
        player1.calculateAverageRating(9.0f, 9.9f);
        player1.calculateCategory();
        player1.display();
        System.out.println();
        PlayerRating player2=new PlayerRating(1,"oscar");
        player2.calculateAverageRating(1.0f, 1.0f , 1.0f);
        player2.calculateCategory();
        player2.display();

    }
    
}

/* OUTPUT

PS C:\Users\bhoir\OneDrive\Desktop\Info_> javac PlayerRating.java
PS C:\Users\bhoir\OneDrive\Desktop\Info_> java PlayerRating
The Player name is beckham
The Player position is 1
The Average Rating is 9.45
The category is A

The Player name is oscar
The Player position is 1
The Average Rating is 1.5
The category is C
 
 * /