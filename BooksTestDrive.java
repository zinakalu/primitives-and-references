class Books{
    String title;
    String author;
}

class BooksTestDrive{
    public static void main(String[] args){

        
        Books [] myBooks = new Books[3];



        myBooks[0] =new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();


        myBooks[0].title = "Java Essentials";
        myBooks[1].title = "Grapes of Java";
        myBooks[2].title = "Java Cookbook";


        myBooks[0].author = "bob";
        myBooks[1].author = "Zina";
        myBooks[2].author = "ian";




        int x = 0;

        while (x < myBooks.length){
            System.out.print(myBooks[x].title + " by " + myBooks[x].author);
            x += 1;
        }


    }
}