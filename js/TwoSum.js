/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 * O(n2) complexity
 */
const twoSum1 = (nums, target) => {
    for (let i = 0; i < nums.length; i++) {
        for (let j = i + 1; j < nums.length; j++) {
            if (i !== j) {
                if ((nums[i] + nums[j]) === target) {
                    return [i, j];
                }
            }
        }
    }
};

/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 * O(1) complexity
 *
 * We can iterate through nums with index i.
 * Let difference = target - nums[i] and check if difference exists
 * in the hash map as we iterate through the array,
 * else store the current element in the hashmap with its index and continue.
 * We use a hashmap for O(1) lookups.
 */
const twoSum2 = (nums, target) => {
    const map = {}; // { diff: idx }
    let diff;
    for (let i = 0; i < nums.length; i++) {
        diff = target - nums[i];

        if (diff in map) {
            return [map[diff], i]
        }

        map[nums[i]] = i
    }

    return [0]
};

console.log(twoSum2([2,99,11,7], 9))
console.log(twoSum2([2,4], 6))
console.log(twoSum2([3, 3], 6))
console.log(twoSum2([2,1,4,3], 6))
