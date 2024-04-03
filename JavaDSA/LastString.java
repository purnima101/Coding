package JavaDSA;

class LastString {
    public static void main(String args[]) {
        String s=" a";
        int l1=-1, l2=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(l1==-1){
                if(s.charAt(i)!=' '){
                    l1=i;
                    l2=i;
                }
            }

            else{
                if(s.charAt(i)!=' '){
                    l2=i;
                    System.out.println("hi");
                }
                else{
                    break;
                }
            }
            
        }
        System.out.println(l2);
    }
}