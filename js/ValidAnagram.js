/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function(s, t) {
    let arr1 = s.split('').sort();
    let arr2 = t.split('').sort();
    if (arr1.length !== arr2.length) return false;
    for (let i = 0; i < arr1.length; i++) {
        if (arr1.at(i) !== arr2.at(i)) {
            return false;
        }
    }
    return true;
};