public class StockList {

    // 1st parameter is the stocklist (L in example),
    // 2nd parameter is list of categories (M in example)

    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if(lstOf1stLetter.length==0| lstOfArt.length==0)
            return "";
        String[] tempRes=new String[lstOf1stLetter.length];
        int sum;
        for(int i=0;i<lstOf1stLetter.length;i++){
            sum=0;
            for(String art:lstOfArt){
                if(lstOf1stLetter[i].toCharArray()[0]==art.toCharArray()[0]){
                    String[]tempStr=art.split(" ");
                    sum+=Integer.parseInt(tempStr[1]);
                }
            }
            tempRes[i]="("+lstOf1stLetter[i]+" : "+sum+" ";
        }
        return String.join(" - ",tempRes);
    }

    public static String oneCat(){

    }
}
