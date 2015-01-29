package com.dstudio.androidgames.framework;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by denny_000 on 27.01.2015.
 */
public interface FileIO {
    public InputStream readAsset(String fileName) throws IOException;

    public InputStream readFile(String fileName) throws IOException;

    public OutputStream writeFile(String fileName) throws IOException;

}
