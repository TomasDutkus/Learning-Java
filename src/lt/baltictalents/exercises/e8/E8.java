package lt.baltictalents.exercises.e8;

class E8 {
    public static void main(String[] args) {
        System.out.println(unlucky1(new int[]{1, 3, 4, 5})); //true
        System.out.println(unlucky1(new int[]{2, 1, 3, 4, 5})); //true
        System.out.println(unlucky1(new int[]{1, 1, 1})); //false
        System.out.println(unlucky1(new int[]{1, 2, 5, 1, 3})); //true
        System.out.println(unlucky1(new int[]{})); //false
        System.out.println(unlucky1(null)); //false
    }

    private static boolean unlucky1(int[] arr) {
        if (arr == null || arr.length < 2) {
            return false;
        }
        int length = arr.length;
        return (arr[0] == 1 && arr[1] == 3) ||
                (arr[1] == 1 && arr[2] == 3) ||
                (arr[length - 2] == 1 && arr[length - 1] == 3);
    }
}
