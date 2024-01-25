public class AAA {
//    public String solution(String[] storage, int[] num) {
public static void main(String[] args) {
    String[] storage = {"p", "p", "p", "b"};
    int[] num = {2, 4, 3, 1};

    int num_item = 0;
    String[] clean_storage = new String[storage.length]; //4
    int[] clean_num = new int[num.length]; //4

    for (int i = 0; i < storage.length; i++) {
        int clean_idx = -1;

        for (int j = 0; j < num_item; j++) {
            if (storage[i].equals(clean_storage[j])) {
                clean_idx = j;
                break;
            }
        }
        if (clean_idx == -1) {
            clean_storage[num_item] = storage[i];
            clean_num[num_item] = num[i];
            num_item += 1;
        } else {
            clean_num[clean_idx] += num[i];
        }
    }

    int num_max = -1;
    String answer = "";
    for(int i=0; i<num_item; i++){
        if(clean_num[i] > num_max){
            num_max = clean_num[i];
            answer = clean_storage[i];
        }
    }

    System.out.println(answer);
}
}








