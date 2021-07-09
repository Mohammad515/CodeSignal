int growingPlant(int upSpeed, int downSpeed, int desiredHeight) {
      int curr = 0, i=0;
	while(true){
        i++;
        curr += upSpeed;
        if(curr >= desiredHeight)
            return i;
        curr -= downSpeed;
    }
