Definition:
A space optimization technique that lets us use less memory by storing externally the data associated with similar objects


Example:
- MMORPG
    - Plenty of users with identical first/last names
    - No sense in storing first/last name over and over
    - Store a list of names and pointers to them
- Bold or italic text in the console
    - Don't want each character to have a formatting characeter
    - Operate on ranges

Notes:
- Avoid redundancy when storing data