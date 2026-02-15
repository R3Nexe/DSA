class Solution:
    def findSubarray(self, arr):
        max_sum = -1
        best_start = -1
        best_end = -1

        curr_sum = 0
        curr_start = 0

        for i in range(len(arr) + 1):
            if i < len(arr) and arr[i] >= 0:
                curr_sum += arr[i]
            else:
                curr_len = i - curr_start
                if curr_len > 0:
                    if curr_sum > max_sum:
                        max_sum = curr_sum
                        best_start = curr_start
                        best_end = i - 1

                    elif curr_sum == max_sum:
                        if curr_len > (best_end - best_start + 1):
                            best_start = curr_start
                            best_end = i - 1
                curr_sum = 0
                curr_start = i + 1

        if best_start == -1:
            return [-1]

        return arr[best_start : best_end + 1]
