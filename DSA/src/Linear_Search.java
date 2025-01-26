public class Linear_Search {
    public static void main(String[] args) {
        int[] arr1= {2,1,4,7,8,9};

        int target=8;
        boolean flag=false;

        for (int i=0;i<arr1.length;i++) {
            if (arr1[i] == target) {
                System.out.println(target + " found @ " + i + " index!");

                flag = true;
                break;
            }
        }
        if (!flag){
            System.out.println("Element not present!");
        }
    }
}
