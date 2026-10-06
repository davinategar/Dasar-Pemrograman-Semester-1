# REPORT JOBSHEET 6: SELECTION 1

Name: Davina Tegar Putri Ervia

Student ID: 246107020083

GitHub: https://github.com/davinategar

## Experiment 1:

![Experiment 1 Result](Experiment-1-Result.png.png)

## Answer:

**1. What happens if the student answers "No" to the penalty-clearance question? Why?**

If the student answers "No", the program goes directly to the `else` statement and displays:

`"failed! the student still has an outstanding penalty"`

**2. Explain the meaning of the following code snippet:**

`if (guidanceCount1 >= 8 && guidanceCount2 >= 4)`

This condition checks whether the student has completed the minimum number of guidance sessions with both supervisors.

  * guidanceCount1 >= 8 means the student must have at least 8 sessions with supervisor 1.
  * guidanceCount2 >= 4 means the student must have at least 4 sessions with supervisor 2.
  * && means both conditions must be true.

If both requirements are fulfilled, the program displays:

`All requirements met. The student may register for the thesis exam`

**3. Describe the full flow of checking the student's requirements from start to finish. Explain step by step for every condition.**

First, the program asks whether the student has cleared all penalties.

  * **Step 1:** If the student answers "yes", the program continues to check the guidance session requirements.
  * **Step 2:** The program checks whether the student has at least 8 guidance sessions with supervisor 1 AND at least 4 sessions with supervisor 2.

    `guidanceCount1 >= 8 && guidanceCount2 >= 4`

    If both conditions are true, the student has fulfilled all requirements and may register for the thesis exam.
  * **Step 3:** If both guidance requirements are below the minimum:
    `guidanceCount1 < 8 && guidanceCount2 < 4`

    the program states that the sessions with both supervisors are insufficient.
   * **Step 4:** If only the sessions with supervisor 1 are below 8:
     `guidanceCount1 < 8`

     the program states that the student has not reached the required 8 sessions with supervisor 1.
   * **Step 5:** Otherwise, the sessions with supervisor 2 must be below 4, so the program states that the student has not reached the required 4 sessions with supervisor 2.
   * **Step 6:** If the student answers "no" to the penalty-clearance question, the program immediately displays that the  student still has an outstanding penalty. The guidance session requirements are not considered.

## Experiment 2:

![Experiment 2 Result](Experiment-2-result.png.png)

| Test | isStudent | isLecturer | isBlocked | Expected Output |
|------|-----------|------------|-----------|-----------------|
| 1 | true | false | false | WiFi access granted |
| 2 | false | true | false | WiFi access granted |
| 3 | true | false | true | WiFi access denied |
| 4 | false | false | false | WiFi access denied |

## Answer:

**1. Explain the function of the ||, &&, and ! operators.**
* `||` (OR) means at least one condition must be true.
* `&&` (AND) means all conditions must be true.
* `!` (NOT) reverses a boolean value. `!isBlocked` means the account is not blocked.

**2. Why can a lecturer still get access when isStudent = false?**

A lecturer can still get access when the condition uses `||` because only one condition needs to be true. If `isStudent` is false but `isLecturer` is true, the OR condition is still true, as long as the account is not blocked.

**3. Change || to &&. What happens?**

Test 1 and Test 2 will be denied access because `&&` requires both `isStudent` and `isLecturer` 

**4.  When does isLecturer not need to be evaluated?**

In `isStudent || isLecturer`, if `isStudent` is already true, `isLecturer` does not need to be evaluated because the OR condition is already true. This is called short-circuit evaluation.

**5. When does !isBlocked not need to be evaluated?**

In `(isStudent || isLecturer) && !isBlocked`, if `isStudent || isLecturer` is false, `!isBlocked` does not need to be evaluated because the entire AND condition will already be false.

