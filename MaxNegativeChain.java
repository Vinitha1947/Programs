public class MaxNegativeChain {
    public static void main(String[] args){
        int[] arr = {1, -2, -3, 6, -4, -2, -1, 14, 2, 14};
        int maxChainLength = findMaxNegativeChain(arr);
            System.out.println("Maximum chain of negative numbers: " + maxChainLength);
        }
        public static int findMaxNegativeChain(int[] arr){
            int maxChainLength = 0;
            int currentChainLength = 0;
            for(int num : arr){
                if(num < 0){
                    currentChainLength++;
                } else {
                    maxChainLength = Math.max(maxChainLength, currentChainLength);
                    currentChainLength = 0;
                }
            }
            maxChainLength = Math.max(maxChainLength, currentChainLength);
            return maxChainLength;
        }
    }

