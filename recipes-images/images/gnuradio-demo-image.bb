require gnuradio-dev-image.bb

IMAGE_FEATURES += "x11-base qt4-pkgs"

CORE_IMAGE_EXTRA_INSTALL += "\
    gqrx \
    xinput-calibrator \
    xf86-video-modesetting \
    directfb-examples \
    wpa-supplicant \
    hostap-daemon \
    python-pyqt \
    gr-baz \
    "
