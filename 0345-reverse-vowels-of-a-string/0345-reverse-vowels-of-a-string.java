class Solution {
    public String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        char[] arr = s.toCharArray();
        int start = 0, end = arr.length - 1;

        while(start < end){
            while(start < end && !vowels.contains(arr[start])){
                start++;
            }

            while(start < end && !vowels.contains(arr[end])){
                end--;
            }

            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        
        return new String(arr);    
    }
}