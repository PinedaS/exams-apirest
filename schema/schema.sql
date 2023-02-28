CREATE DATABASE "exam-database"
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'Spanish_Spain.1252'
    LC_CTYPE = 'Spanish_Spain.1252'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;

CREATE TABLE IF NOT EXISTS public.answers
(
    id integer NOT NULL,
    id_students integer NOT NULL,
    id_exams integer NOT NULL,
    id_questions integer NOT NULL,
    id_options integer NOT NULL,
    "questionScore" integer NOT NULL,
    CONSTRAINT answers_pkey PRIMARY KEY (id),
    CONSTRAINT answersexams_exams FOREIGN KEY (id_exams)
    REFERENCES public.exams (id) MATCH SIMPLE
    ON UPDATE CASCADE
    ON DELETE CASCADE
    NOT VALID,
    CONSTRAINT answersoptions_options FOREIGN KEY (id_options)
    REFERENCES public.options (id) MATCH SIMPLE
    ON UPDATE CASCADE
    ON DELETE CASCADE
    NOT VALID,
    CONSTRAINT answersquestions_questions FOREIGN KEY (id_questions)
    REFERENCES public.questions (id) MATCH SIMPLE
    ON UPDATE CASCADE
    ON DELETE CASCADE
    NOT VALID,
    CONSTRAINT answersstudents_students FOREIGN KEY (id_students)
    REFERENCES public.students (id) MATCH SIMPLE
    ON UPDATE CASCADE
    ON DELETE CASCADE
    NOT VALID
    )

CREATE TABLE IF NOT EXISTS public.exams
(
    id integer NOT NULL,
    "submissionDate" date NOT NULL,
    "examTimeZone" "char" NOT NULL,
    CONSTRAINT exams_pkey PRIMARY KEY (id)
    )

CREATE TABLE IF NOT EXISTS public.options
(
    id integer NOT NULL,
    id_questions integer NOT NULL,
    CONSTRAINT options_pkey PRIMARY KEY (id),
    CONSTRAINT questionsoptions_options FOREIGN KEY (id_questions)
    REFERENCES public.questions (id) MATCH SIMPLE
    ON UPDATE CASCADE
    ON DELETE CASCADE
    NOT VALID
    )

CREATE TABLE IF NOT EXISTS public.questions
(
    id integer NOT NULL,
    id_exams integer NOT NULL,
    question_description character varying COLLATE pg_catalog."default" NOT NULL,
    correct_option "char" NOT NULL,
    CONSTRAINT questions_pkey PRIMARY KEY (id),
    CONSTRAINT examsquestions_exams FOREIGN KEY (id_exams)
    REFERENCES public.exams (id) MATCH SIMPLE
    ON UPDATE CASCADE
    ON DELETE CASCADE
    NOT VALID
    )

CREATE TABLE IF NOT EXISTS public.students
(
    id integer NOT NULL,
    name "char" NOT NULL,
    last_name "char" NOT NULL,
    age integer NOT NULL,
    residence_city "char" NOT NULL,
    student_time_zone "char" NOT NULL,
    CONSTRAINT students_pkey PRIMARY KEY (id)
    )

CREATE TABLE IF NOT EXISTS public.students_exams
(
    id integer NOT NULL,
    id_students integer NOT NULL,
    id_exams integer NOT NULL,
    CONSTRAINT students_exams_pkey PRIMARY KEY (id),
    CONSTRAINT studentsexams_exams FOREIGN KEY (id_exams)
    REFERENCES public.exams (id) MATCH SIMPLE
    ON UPDATE CASCADE
    ON DELETE CASCADE
    NOT VALID,
    CONSTRAINT studentsexams_students FOREIGN KEY (id_students)
    REFERENCES public.students (id) MATCH SIMPLE
    ON UPDATE CASCADE
    ON DELETE CASCADE
    NOT VALID
    )