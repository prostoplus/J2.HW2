public class Main {

    private static int sumAllStrings(String[][] arr) throws MyArraySizeException, MyArrayDataException {

        int sum = 0;
        if (arr.length != 4) throw new MyArraySizeException();

        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i].length != 4) throw new MyArraySizeException();
            for (int j = 0; j <= arr[i].length - 1; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        String[][] t1 = {{"0", "1", "2", "3"}, {"0", "1", "2", "3"}, {"0", "1", "2", "3"}, {"0", "1", "2", "3"}};

        int sumFin = 0;
        try{
            try {
                sumFin =  sumAllStrings(t1);
            } catch (MyArraySizeException e){
                System.out.println(e.toString());
            }
        } catch (MyArrayDataException e1){
            System.out.println(e1.toString());
        }

        System.out.println("Сумма элементов равна " + sumFin);
    }
}