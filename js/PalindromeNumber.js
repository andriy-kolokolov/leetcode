/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function (x) {
    if (x < 0) return false;
    let reversed = 0, tempX = x;
    while (tempX) {
        reversed = reversed * 10 + tempX % 10; // tempX % 10: to get last digit
        tempX = Math.floor(tempX /= 10);
    }
    return reversed === x;
};