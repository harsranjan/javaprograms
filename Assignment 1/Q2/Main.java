public class Main{
    public static void main(String[] args){
        String w = "harsranjan";
        System.out.println(biggerIsGreater(w));
    }
    public static String biggerIsGreater(String w) {
        char[] arr = w.toCharArray();
        int i = arr.length - 1;
        while(i > 0 && arr[i - 1] >= arr[i]){
            i--;
        }
        if(i <= 0){
            return "no answer";
        }
        int j = arr.length - 1;
        while(arr[j] <= arr[i - 1]){
            j--;
        }
        char temp = arr[i - 1];
        arr[i - 1] = arr[j];
        arr[j] = temp;
        j = arr.length - 1;
        while(i < j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return new String(arr);
    }
}