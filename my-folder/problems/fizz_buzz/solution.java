class Solution {
    public List<String> fizzBuzz(int n) {

        List<String> arr = new ArrayList<String>(n);

        for(int i = 1; i < n+1; i++){
            if(i % 3 == 0 && i % 5 == 0){
                arr.add("FizzBuzz");
                continue;
            }
            if(i % 3 == 0){
                arr.add("Fizz");
                continue;
            }
            if(i % 5 == 0){
                arr.add("Buzz");
                continue;
            }
            else{
                arr.add(""+i);
            }
        }
        return arr;

    }
}