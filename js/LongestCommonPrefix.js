/**
 * @param {string[]} strs
 * @return {string}
 */
var longestCommonPrefix = function(strs) {
    strs.sort();
    let firstStr = strs[0];
    let lastStr = strs[strs.length - 1];
    let idx = 0;

    while (idx < firstStr.length && idx < lastStr.length) {
        if (firstStr.charAt(idx) === lastStr.charAt(idx)) {
            idx++
        } else {
            break
        }
    }
    return firstStr.substring(0, idx);
};