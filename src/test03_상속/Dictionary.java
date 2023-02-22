package test03_상속;

public class Dictionary extends PairMap {

    private int index;

    public Dictionary(int num) {
        keyArray = new String[num];
        valueArray = new String[num];
        index = 0;
    }

    void test(String key, String value) {
        keyArray[0] = key;
        valueArray[0] = value;
    }

    @Override
    String get(String key) {
        for (int i = 0; i < keyArray.length; i++) {
            if (keyArray[i] != null && keyArray[i].equals(key)) {
                return valueArray[i];
            }
        }
        return null;
    }

    @Override
    void put(String key, String value) {
        for (int i = 0; i < keyArray.length; i++) {
            if (keyArray[i] != null && keyArray[i].equals(key)) { // 기존 key의 내용의 value 만 수정할 때
                valueArray[i] = value;
            } else {
                keyArray[index] = key;
                valueArray[index] = value;
            }
        }
        index++;
    }

    @Override
    String delete(String key) {
        String deleted = null;
        for (int i = 0; i < keyArray.length; i++) {
            if (keyArray[i] != null && keyArray[i].equals(key)) {
                deleted = valueArray[i];
                valueArray[i] = null;
                // 삭제된 배열의 다음 배열을 한 칸씩 당겨서 저장하기
                for (int j = i; j < keyArray.length - 1; j++) {
                    keyArray[i] = keyArray[i + 1];
                    valueArray[i] = valueArray[i + 1];
                }
                index--;
            }
        }
        return deleted;
    }

    @Override
    int length() {
        return keyArray.length;
    }

}
