import sqlite3 

class conexionDB:
    def __init__(self):
        self.base_datos = 'database/estudiantes1.db'
        self.conexion = sqlite3.connect(self.base_datos)
        self.cursor = self.conexion.cursor()

    def cerrar(self):
        self.conexion.commit()
        self.conexion.close()
        






