DROP TABLE IF EXISTS Clientes;
DROP TABLE IF EXISTS Empleados;
DROP TABLE IF EXISTS Horarios;
DROP TABLE IF EXISTS Mensajes;

Create  table  Clientes (
    ID int primary key,
    Nombre varchar(50),
    Direcci0n varchar(200),
    Email varchar(50),
    Movil varchar(15),
    password varchar(50)
);

Create  table  Empleados (
    ID int primary key,
    Nombre varchar(50),
    Email varchar(50),
    Movil varchar(15),
    password varchar(50),
    NumSS varchar(15),
    Rol varchar(1) not null
);


Create  table  Horarios (
    ID int primary key,
    Fecha date,
    HoraInicio time,
    HoraFin time,
    ID_Empleado int,
    ID_Cliente int,
    foreign key (ID_Empleado) references Empleados(ID),
    foreign key (ID_Cliente) references Clientes(ID)
);

Create  table  Mensajes (
    ID int primary key,
    Fecha date,
    Hora time,
    ID_Empleado int,
    ID_Cliente int,
    Mensaje varchar(200),
    foreign key (ID_Empleado) references Empleados(ID),
    foreign key (ID_Cliente) references Clientes(ID)
);


