int absoluteValuesSumMinimization(int[] a) {
      if(a.length % 2 == 0) {
            return (a[a.length/2]) > (a[a.length/2 - 1]) ? a[a.length/2-1] : a[a.length/2];
        }
        else{
            return a[a.length / 2];
        }
    }

