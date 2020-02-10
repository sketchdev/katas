# Functionality

## TODO: Update a "start" branch for College 2020

## Submit College Application

Applicant provides name, email and ssn and submits application.

- All fields are required
- Email must be a valid format
- SSN must be 9 digits
- Legacy (Child of Alumnus)

## (X) Pull SAT Score Data

Upon submission, SAT scores are retrieved

- Single attempt to fetch scores
- Reject application if scores cannot be retrieved

## Automated College Application Review

- Reject combined SAT score below 1,000
- Reject math SAT score below 400
- Reject reading SAT score below 350
- Approve math score >= 750 and reading >= 600
- Approve reading score >= 780 and math score >= 600
- Approve combined score >= 1250 and legacy
- Reject Math SAT score below 350
- Waitlist combined SAT score >= 1250 and < 1350

### More Complex Requirements

- Weight GPA (for example, accept with 5% lower score if 4.0)

## Manual Review College Application

- (X) Select application from list
- Review application and admit, wait-list or reject
- Cannot change an admission decision
- (X) Email sent detailing admission decision
