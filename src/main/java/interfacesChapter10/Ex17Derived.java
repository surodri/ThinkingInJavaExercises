package interfacesChapter10;

public class Ex17Derived implements Ex17Interface{

    public static void main(String [] args){
        System.out.println(field); //proved interface field is static because
                                    // it is not splecitetly stated by access form main
                                    // and main it static
        //field = 8;                //prove interface is final
                                    //because it gives error when trying to edit

    }

}
