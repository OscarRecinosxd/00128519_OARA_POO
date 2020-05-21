using System;
using System.Data;
using Npgsql;


namespace Laboratorio_09
{
    public static class ConnectionBD
    {
        private static string host = "127.0.0.1",
            database = "Laboratorio09",
            userID = "postgres",
            password = "uca";

        private static string sConnection =
            $"Host={host};Port=5432;User ID={userID};Password={password};Database={database};";


        public static DataTable ExcuteQuery(string query)
        {
            NpgsqlConnection connection = new NpgsqlConnection(sConnection);    
            DataSet ds = new DataSet();

            connection.Open();
            
            NpgsqlDataAdapter da = new NpgsqlDataAdapter(query, connection);
            da.Fill(ds);

            connection.Close();

            return ds.Tables[0];
        }

        public static void ExecuteNonQuery(string act)
        {

            NpgsqlConnection connection = new NpgsqlConnection(sConnection);

            connection.Open();

            NpgsqlCommand command = new NpgsqlCommand(act, connection);
            command.ExecuteNonQuery();
            
            connection.Close();
        }
    }
}