Select Student.ID, Student.Name
From Grade, Student
Where Grade.StudentID = Student.ID
And Student.Age = "20"
And Student.Name = "George Burdell"
And Grade.Grade = "100"