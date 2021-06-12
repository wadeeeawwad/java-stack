public class StringManipulator {
    public Integer getIndexOrNull(String str, char letter) {
    int idx = str.indexOf(letter, 0);
    if( idx == -1) {
        return null;
    }
    return idx;
}
}