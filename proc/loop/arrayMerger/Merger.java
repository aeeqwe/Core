package proc.loop.arrayMerger;

public class Merger {
    public static int[] merge(int[] a, int[] b) { 
        int[] result = new int[a.length + b.length];
        int aIndex = 0;
        int bIndex = 0;

        while (aIndex + bIndex != result.length ) {
            boolean aIndexInBounds = aIndex < a.length;
            boolean bIndexInBounds = bIndex < b.length;

            if(!aIndexInBounds && bIndexInBounds){
                System.arraycopy(b, bIndex, result, aIndex + bIndex, b.length - bIndex);
                break;
            }

            if(!bIndexInBounds && aIndexInBounds){
                System.arraycopy(a, aIndex, result, bIndex + aIndex, a.length - aIndex);
                break;
            }

            if (a[aIndex] < b[bIndex]) {
                result[aIndex + bIndex] = a[aIndex++];
            } else if (bIndexInBounds) {
                result[aIndex + bIndex] = b[bIndex++];
            }
        }

        return result;
    }


	public static int[] myMerge(int[] a, int[] b) {
		int [] res = new int[a.length+b.length];
		int aIndex = 0;
		int bIndex= 0;
		int resIndex= 0;
		while (aIndex < a.length && bIndex < b.length){
			if (a[aIndex] < b[bIndex]){
				res[resIndex] = a[aIndex++];
				resIndex++;				
			}else {
				res[resIndex] = b[bIndex++];
				resIndex++;		
			}
		}
		
		while (aIndex < a.length){
			res[resIndex] = a[aIndex++];
			resIndex++;		
		}
		while (aIndex < a.length){
			res[resIndex] = b[bIndex++];
			resIndex++;		
		}
				
			
		return res;
	}
	


}