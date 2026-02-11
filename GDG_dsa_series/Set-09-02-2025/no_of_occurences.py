class Solution:
    def countFreq(self, arr, target):
        def firstOccur(arr, target):
            idx = -1
            l, r = 0, len(arr) - 1
            while l <= r:
                mid = (l + r) // 2
                if arr[mid] == target:
                    idx = mid
                    r = mid - 1
                elif arr[mid] < target:
                    l = mid + 1
                else:
                    r = mid - 1
            return idx

        def lastOccur(arr, target):
            idx = -1
            l, r = 0, len(arr) - 1
            while l <= r:
                mid = (l + r) // 2
                if arr[mid] == target:
                    idx = mid
                    l = mid + 1
                elif arr[mid] < target:
                    l = mid + 1
                else:
                    r = mid - 1
            return idx

        first = firstOccur(arr, target)
        last = lastOccur(arr, target)
        if first == -1 or last == -1:
            return 0
        return last - first + 1
