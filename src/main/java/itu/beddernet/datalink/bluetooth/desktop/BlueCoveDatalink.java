package itu.beddernet.datalink.bluetooth.desktop;

import itu.beddernet.common.Observer;
import itu.beddernet.datalink.DatalinkInterface;

/**
 * @author spheros
 */
public class BlueCoveDatalink implements DatalinkInterface {
    @Override
    public void connectToNetwork(Observer incPcktObs, Observer neighbourObs) {

    }

    @Override
    public void disconnectNetwork() {

    }

    @Override
    public boolean sendPacket(long na, byte[] pckt) {
        return false;
    }

    @Override
    public long searchNewConnections() {
        return 0;
    }

    @Override
    public long getNetworkAddress() {
        return 0;
    }

    @Override
    public String getStatus(long na) {
        return null;
    }
}
