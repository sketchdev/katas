package io.sketchdev.katas;

public class DatabaseConnection
{
    String _serverName;
    int _timeout;
    String _datasetname;

    public DatabaseConnection(String servername, int timeout, String datasetName)
    {
        _serverName = servername;
        _timeout = timeout;
        _datasetname = datasetName;
    }

    public Boolean IsConnected()
    {
        return !(_serverName == null || _serverName.trim().length() == 0);
    }
}
