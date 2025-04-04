/**
 * @return {boolean}
 * @param s
 * @param t
 */
const isAnagram = function (s, t) {
    if (s.length !== t.length) return false;
    return s.trim().split('').sort().toString() === t.trim().split('').sort().toString();
};

console.log(isAnagram('anna', 'naan'))
