# Functionality

## Submit College Application

Applicant provides name, email and ssn and submits application.

* All fields are required
* Email must be a valid format
* SSN must be 9 digits
* Legacy (Child of Alumnus)

## (X) Pull SAT Score Data

Upon submission, SAT scores are retrieved

* Single attempt to fetch scores
* Reject application if scores cannot be retrieved

## Automated College Application Review

Reject

* Combined SAT score below 1,000
* Math SAT score below 400
* Reading SAT score below 350
  Approve
* Math score >= 750 and Reading >= 600
* Reading score >= 780 and Math score >= 600
* Combined Score >= 1250 and Legacy
  Waitlist
* Is this only done in manual review?

Add-on Requirements

* Weight GPA (for example, accept with 5% lower score if 4.0)
* Add conflicting rule and demonstrate unit tests catching the conflict

## Manual Review College Application

* (X) Select application from list
* Review application and admit, wait-list or reject
* Cannot change an admission decision
* (X) Email sent detailing admission decision
