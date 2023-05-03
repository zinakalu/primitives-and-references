class Cat{
    String name;
    public static void main(String[] args){
        Cat cat1 = new Cat();
        cat1.meow();
        cat1.name = "Bart";

        Cat[] myCats = new Cat[3];
        myCats[0] = new Cat();
        myCats[1] = new Cat();
        myCats[2] = cat1;



        myCats[0].name = "Bart";
        
        myCats[1].name = "Spot";

        System.out.print("last cat's name is ");
        System.out.println(myCats[2].name);

        int x = 0;

        while (x < myCats.length){
            myCats[x].meow();
            x += 1;
        }
        
    
    }
    public void meow(){
        System.out.println(name + " Meow");
    }
}