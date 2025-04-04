/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function(nums) {
    for (let i = 0; i < nums.length; i++) {
        for (let j = 0; j < nums.length; j++) {
            if (nums.at(i) === nums.at(j) && i !== j) {
                return true;
            }
        }
    }
    return false
};