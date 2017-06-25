package com.ironz.binaryprefs.file.transaction;

import com.ironz.binaryprefs.file.FileAdapter;

public final class FileTransactionExecutorImpl implements FileTransactionExecutor {

    private final FileAdapter fileAdapter;

    public FileTransactionExecutorImpl(FileAdapter fileAdapter) {
        this.fileAdapter = fileAdapter;
    }

    @Override
    public FileElement[] getAll() {
        synchronized (FileTransactionExecutor.class) {
            String[] names = fileAdapter.names();
            FileElement[] elements = new FileElement[names.length];
            for (int i = 0; i < names.length; i++) {
                String name = names[i];
                byte[] bytes = fileAdapter.fetch(name);
                elements[i] = new FileElement(name, bytes);
            }
            return elements;
        }
    }

    @Override
    public void update(FileElement[] elements) {
        synchronized (FileTransactionExecutor.class) {
            for (int i = 0; i < elements.length; i++) {
                FileElement element = elements[i];
                String name = element.getName();
                byte[] bytes = element.getContent();
                fileAdapter.save(name, bytes);
            }
        }
    }

    @Override
    public void remove(String[] names) {
        synchronized (FileTransactionExecutor.class) {
            for (int i = 0; i < names.length; i++) {
                String name = names[i];
                fileAdapter.remove(name);
            }
        }
    }
}