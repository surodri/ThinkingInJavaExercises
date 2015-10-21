package interfacesChapter10.adapterPatternEx11;


public class Ex11 implements Processor {
    public String name(){
        return getClass().getSimpleName();
    }

    @Override
    public Object process(Object input) {
        return swap((String) input);
    }

    public String swap(String text) {

        String[] swapString = text.split("(?!^)");
        String result = "";
        for(int i = 0; i<swapString.length-1; i++){

            if(i==0||i%2==0){

                result = result.concat(swapString[i+1]);
                result= result.concat(swapString[i]);
            }
        }
       return result;
    }

    public static void main(String[] args){
        Ex11 ex11 = new Ex11();
        Apply.process(new Ex11(), "Being staring at the screen to long");
    }
}
