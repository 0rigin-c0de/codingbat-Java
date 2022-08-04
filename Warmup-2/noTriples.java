public boolean noTriples(int[] nums) {
    // Iterate < length-2, so can use i+1 and i+2 in the loop.
    // Return false immediately if every seeing a triple.
    for (int i=0; i < (nums.length-2); i++) {
      int first = nums[i];
      if (nums[i+1]==first && nums[i+2]==first) return false;
    }
    
    // If we get here ... no triples.
    return true;
  }