package revise.string;

class ZeroGapInBinaryNumber {
    public static int solution(int N) {
        String b = Integer.toBinaryString(N);

        char[] binaryArr = b.toCharArray();
        int max = 0;
        int internalCount = 0;
        for(int index=1; index< binaryArr.length; index++){
            if(binaryArr[index] =='0')
                internalCount++;
            else{

                if (max<internalCount) {
                    max = internalCount;
                }

                internalCount =0;

            }
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(solution(9));
    }
}