/**
 * @param {number[]} nums
 * @return {boolean}
 */
const containsDuplicate = (nums) => {
    const sorted = nums.sort();
    for (let i = 0; i < sorted.length - 1; i++) {
        if (sorted[i] === sorted[i + 1]) {
            return true;
        }
    }
    return false;
};

try {
    console.assert(containsDuplicate([1, 2, 3, 4, 5, 6, 7, 8, 12]) === false, 'Test Case 1 Failed');
    console.log('Test Case 1 Passed');
    console.assert(containsDuplicate([1, 2, 3, 4, 5, 6, 7, 8, 12, 1]) === true, 'Test Case 2 Failed');
    console.log('Test Case 2 Passed');
    console.assert(containsDuplicate([1, 1, 2, 3, 4, 5]) === true, 'Test Case 3 Failed');
    console.log('Test Case 3 Passed');
    console.assert(containsDuplicate([1, 2, 3, 4, 5, 6, 7, 8, 9]) === false, 'Test Case 4 Failed');
    console.log('Test Case 4 Passed');
    console.assert(containsDuplicate([]) === false, 'Test Case 5 Failed');
    console.log('Test Case 5 Passed');
} catch (e) {}

