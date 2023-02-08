

class Bubble_sort {
    public static void main(String[] args) {
        int[] numbers = {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};
        for (int i = numbers.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.println("i="+i+" j= "+j);
                /*сравниваем элементы попарно,
                если они имеют неправильный порядок,
                то меняем местами
                 */
                if (numbers[j] > numbers[j + 1]) {
                    int tmp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tmp;
                }
            }
        }
        for(int h = 0; h < numbers.length; h++) {
            System.out.println(numbers[h]);
        }
    }
}
