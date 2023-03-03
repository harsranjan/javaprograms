class Player

{

  String name;

  int age;

  Player(String n,int a)

  { name=n; age=a; }

  void display()

  {

     System.out.println("Player name: "+name);

     System.out.println("Age: "+age);

  }

}

class CricketPlayer extends Player

{

  String type;

  CricketPlayer(String n,String t,int a)

  {

     super(n,a);

     type=t;

  }

  void display()

  {

     super.display();

     System.out.println("Player type : "+type);

  }

}

class FootballPlayer extends Player

  {
     String type;

     FootballPlayer(String n,String t,int a)

  {

     super(n,a);

     type=t;

  }

   void display()

   {

     super.display();

     System.out.println("Player type : "+type);

   }

}

class HockeyPlayer extends Player

{

   String type; 

   HockeyPlayer(String n,String t,int a)

   {

      super(n,a);

      type=t;

   }

   void display()

   {

      super.display();

      System.out.println("Player type : "+type);

   }

}

class MainPlayer

{

   public static void main(String args[])

   {

     CricketPlayer obj1=new CricketPlayer("Harsh","Cricket",20);

     FootballPlayer obj2=new FootballPlayer("Abhinav","Football",19);

     HockeyPlayer obj3=new HockeyPlayer("Aditya","Hockey",19);

     obj1.display();

     obj2.display();

     obj3.display();

   }

}