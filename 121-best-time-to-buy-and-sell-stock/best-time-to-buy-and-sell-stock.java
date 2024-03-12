class Solution {
    public int maxProfit(int[] prices) {

        int min_value = prices[0]; // the smallest value found
        int max_value = 0; // the largest value found AFTER the smallest value found
        int index_min_value = 0; // index of smallest value
        int index_max_value = -1; // index of largest value; not found hence -1
        int second_min_value = 0; // smallest value found AFTER largest value, waiting for a larger value after it (smaller than min value)
        int second_min_value_index = -1; // index of smallest value AFTER max value
        int second_max_value = 0; // second largest value found (smaller than max but greater than second min)
        int second_max_value_index = -1; // index of second largest value found

        for (int i = 0; i < prices.length; i++){
            // if the current value is smaller than the min_value AND before the max_value, update min
            if (prices[i] < min_value && (index_max_value == -1 || i < index_max_value)){
                min_value = prices[i];
                index_min_value = i;
            } 
            // if the current value is smaller than the min_value BUT after the max_value, then check, if the current value is smaller then the second_min_value, then update second_min
            else if (prices[i] < min_value && (second_min_value_index == -1 || prices[i] < second_min_value)) {
                second_min_value = prices[i];
                second_min_value_index = i;
            } 
            // if the current value is greater than the min_value and comes AFTER the min_value AND it is greater than the max_value, then update the max_value
            else if (prices[i] > min_value && index_min_value < i && prices[i] >= max_value) {
                max_value = prices[i];
                index_max_value = i;
            } 
            // if second_min has been intialised and the current value is greater than it and it comes after it, AND the current value is greater than the second_max_value, then update second_max
            else if (second_min_value_index != -1 && prices[i] > second_min_value && i > second_min_value_index 
            && (second_max_value_index == -1 ||  prices[i] > second_max_value)) {
                second_max_value = prices[i];
                second_max_value_index = i;
            }
            // now if the second_min is smaller than the current min_value and a max_value has been found which comes AFTER the second_min, then update the current min_value with the second_min
            if (second_min_value_index > index_min_value && second_min_value_index < index_max_value){
                min_value = second_min_value;
                index_min_value = second_min_value_index;
            }
        }

        // now calculate three profits and find the maximum profit out of all three
        int profitMin = 0; // max-min
        int profitSecond = 0; // max-second_min
        int profitSecMax = 0; // second_max-second_min
        // these profits are only calculated IF the condition is fulfilled that the max value comes AFTER the min value that is being used for profit calculation

        // if the max_value is greater than the min_value, subtract and find profitMin
        if (min_value < max_value){
            profitMin =  max_value - min_value;
        }

        // if the second_min value has been intialised (index is not -1) AND the second_min comes BEFORE the max_value, then find profit between second_min and max and find profitSecond
        if (second_min_value_index != -1 && second_min_value_index < index_max_value) {
            profitSecond =  max_value - second_min_value;
        }

        // if the second min value and the second max value both are intialised then find profit between second_min and second_max and find profitSecMax
        if (second_min_value_index != -1 && second_max_value_index != -1) {
            profitSecMax = second_max_value - second_min_value;
        }

        // return the largest of all three. if all dont fullfill the conditions then all are 0 and 0 will be returned. 
        return Math.max(profitMin, Math.max(profitSecond, profitSecMax));

    }
}