from .conexion_db import conexionDB

from tkinter import messagebox

def crear_tabla():
    conexion = conexionDB()

    sql = '''
    CREATE TABLE estudiantes(
        id_estudiante INTEGER PRIMARY KEY AUTOINCREMENT,
        nombre VARCHAR(100),
        apellidos VARCHAR(100),
        no_celular VARCHAR(100),
        fecha_nacimiento DATE
    )'''
    try:
        conexion.cursor.execute(sql)
        conexion.cerrar()
        titulo = 'Crear Registro'
        mensaje = 'Se creó la tabla en la base de datos'
        messagebox.showinfo(titulo, mensaje)
    except:
        titulo = 'Crear Registro'
        mensaje = 'La tabla ya está creada'
        messagebox.showwarning(titulo, mensaje)
        

def borrar_tabla():
    conexion = conexionDB()

    sql = 'DROP TABLE estudiantes'
    try:
        conexion.cursor.execute(sql)
        conexion.cerrar()
        titulo = 'Borrar Registro'
        mensaje = 'La tabla se borró con éxito'
        messagebox.showinfo(titulo, mensaje)
    except:
        titulo = 'Borrar Registro'
        mensaje = 'No hay tabla para borrar'
        messagebox.showerror(titulo, mensaje)      

class Estudiante:
    def __init__(self, nombre,apellidos,no_celular,fecha_nacimiento):
        self.id_estudiante = None
        self.nombre = nombre
        self.apellidos = apellidos
        self.no_celular = no_celular
        self.fecha_nacimiento = fecha_nacimiento
    
    def __str__(self):
        return f'Estudante[{self.nombre}, {self.apellidos}, {self.no_celular}, {self.fecha_nacimiento}]'

def guardar(estudiante):
    conexion = conexionDB()

    sql = f"""INSERT INTO estudiantes (nombre, apellidos, no_celular, fecha_nacimiento) VALUES('{estudiante.nombre}','{estudiante.apellidos}','{estudiante.no_celular}','{estudiante.fecha_nacimiento}')"""

    try:
        conexion.cursor.execute(sql)
        conexion.cerrar()
    except:
        titulo = 'Conexión al registro'
        mensaje = 'La tabla estudiantes no está creada en la base de datos'
        messagebox.showerror(titulo,mensaje)

def listar():
    conexion = conexionDB()

    lista_estudiantes = []
    sql = 'SELECT * FROM estudiantes'

    try:
        conexion.cursor.execute(sql)
        lista_estudiantes = conexion.cursor.fetchall()
        conexion.cerrar()
    except:
        titulo = 'Conexión al registro'
        mensaje = 'Crea la tabla en la base de datos'
        messagebox.showwarning(titulo,mensaje)

    return lista_estudiantes

def editar (estudiante, id_estudiante):
    conexion = conexionDB()

    sql = f"""UPDATE estudiantes
    SET nombre = '{estudiante.nombre}', apellidos = '{estudiante.apellidos}',
    no_celular = '{estudiante.no_celular}',
    fecha_nacimiento = '{estudiante.fecha_nacimiento}' 
    WHERE id_estudiante = {id_estudiante}"""
    
    try:
        conexion.cursor.execute(sql)
        conexion.cerrar()
    except:
        titulo = 'Edición de datos'
        mensaje = 'No se ha logrado editar este registro'
        messagebox.showerror(titulo,mensaje)

def eliminar(id_estudiante):
    conexion = conexionDB()
    sql = f'DELETE FROM estudiantes WHERE id_estudiante = {id_estudiante}'

    try:
        conexion.cursor.execute(sql)
        conexion.cerrar()
    except:
        titulo = 'Eliminar datos'
        mensaje = 'No se ha logrado eliminar este registro'
        messagebox.showerror(titulo,mensaje)