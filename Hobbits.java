class Hobbits{
    String name;

    public static void main(String[] args){
        Hobbits[] h = new Hobbits[3];

        int z = -1;

        while (z < 2){
            z +=1;

            h[z] = new Hobbits();
            h[z].name = "bilbo";
            if (z == 1){
                h[z].name = "frodo";
            }

            if (z ==2){
                h[z].name = "sam";
            }
             System.out.println(h[z].name + " is a ");
             System.out.println("good Hobbit name.");
        }
        
    }
}

// h[0] = new Hobbits();
//         h[1] = new Hobbits();
//         h[2] = new Hobbits();


//         h[0].name = "Maria";
//         h[1].name = "joe";
//         h[2].name = "kevin";


//         int z = 0;

//         while (z < h.length){
//             System.out.println(h[z].name + " is a ");
//             System.out.println("good Hobbit name.");
//             z += 1;
//         }
//     }
