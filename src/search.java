public class search {

    public static int sequential_search(int A[], int search_key){
        // also called linear search
        // returns the index of the search key if found else returns -1
        int i = 0;
        int n = A.length;

        while (A[i] != search_key){
            i++;
        }
        if (i < n) return i;
        else return -1;
    }

    public static int binary_search(int A[], int search_key){
        //  returns the index of the search key if found  else returns -1
        int n = A.length;
        int l = 0;
        int r = n - 1;

        while (l <= r){
            int m = (l+r)/2;

            if (search_key == A[m]) return m;
            else if (search_key < A[m]) r = m - 1;
            else l = m + 1;

        }
        return -1;
    }
}