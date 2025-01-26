public class Binary_Search {
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 5, 6, 8};

        int target=7;
        int lb=0;
        int ub= arr.length-1;
        boolean flag=false;

        while (lb<=ub) {
            int mid = (lb + ub) / 2;

            if (arr[mid] == target) {
                System.out.println(arr[mid] + " found @ " + mid);
                flag = true;
                break;
            } else if (arr[mid] < target) {
                lb = mid + 1;
            } else {
                ub = mid - 1;
            }
        }

        if (!flag){
            System.out.println("Element not present in array!");
        }
    }
}

